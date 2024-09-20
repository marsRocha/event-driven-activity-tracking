import { Routes } from '@angular/router';
import { AppComponent } from './app.component';

export const routes: Routes = [
  { path: 'home', component: AppComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full' },  // Default route
  { path: '**', redirectTo: '/home' }  // Wildcard route for invalid URLs
];
