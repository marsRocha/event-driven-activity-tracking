import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-page-one',
  standalone: true,
  imports: [HttpClientModule, CommonModule],
  templateUrl: './page-one.component.html',
  styleUrls: ['./page-one.component.css']
})
export class PageOneComponent implements OnInit {

  activities: any[] = [];

  constructor(private http: HttpClient) { }

  fetchActivities() {
    this.http.get('http://localhost:8080/api/v1/activity').subscribe(
      (response: any) => {
        console.log(response);
        this.activities = response;
      },
      (error) => {
        console.error("Error fetching activities:", error);
      }
    );
  }

  ngOnInit(): void {
    var event = {activityType: 'page_visit', pageUrl: '/home', timestamp: new Date().toISOString()}
    this.http.post("http://localhost:8080/api/v1/activity", event)
    .subscribe(
      (response) => console.log("Event sent successfully", response),
      (error) => console.error("Error sending event", error)
    );

    this.fetchActivities()
  }

  onButtonClick(): void {
    var event = {activityType: 'button_click', pageUrl: '/home', timestamp: new Date().toISOString()}
    this.http.post("http://localhost:8080/api/v1/activity", event)
    .subscribe(
      (response) => console.log("Event sent successfully", response),
      (error) => console.error("Error sending event", error)
    );

    this.fetchActivities()
  }

  onClearClick(): void {
    this.http.delete("http://localhost:8080/api/v1/activity").subscribe()

    this.fetchActivities()
  }
}
