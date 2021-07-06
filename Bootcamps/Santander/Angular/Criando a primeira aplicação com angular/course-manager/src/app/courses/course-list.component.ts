import { Component, OnInit } from "@angular/core";
import { Course } from "./course";

@Component({
  selector: 'app-course-list',
  templateUrl: './course-list.component.html'
})

export class CourseListComponent implements OnInit{

  courses: Course[] = [];
  ngOnInit():void{
    this.courses=[
      {
        id:1,
        name:'Angular: Forms',
        imageUrl:'/assets/images/forms.png',
        price: 99.99,
        code:'XPS-8796',
        duration: 120,
        rating: 5.4,
        releaseDate: 'Decemer. 2, 2019'
      },
      {
        id:2,
        name:'Angular: HTTP',
        imageUrl:'/assets/images/http.png',
        price: 45.99,
        code:'XPS-1095',
        duration: 80,
        rating: 4,
        releaseDate: 'Decemer. 4, 2019'
      }
    ]
  }
}
