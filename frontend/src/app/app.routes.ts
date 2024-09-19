import { Routes } from '@angular/router';
import { PageOneComponent } from './page-one/page-one.component';
import { PageTwoComponent } from './page-two/page-two.component';

export const routes: Routes = [
  { path: 'page-one', component: PageOneComponent },
  { path: 'page-two', component: PageTwoComponent },
  { path: '', redirectTo: '/page-one', pathMatch: 'full' },  // Default route
  { path: '**', redirectTo: '/page-one' }  // Wildcard route for invalid URLs
];
