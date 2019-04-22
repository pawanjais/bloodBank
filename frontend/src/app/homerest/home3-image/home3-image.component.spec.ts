import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Home3ImageComponent } from './home3-image.component';

describe('Home3ImageComponent', () => {
  let component: Home3ImageComponent;
  let fixture: ComponentFixture<Home3ImageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Home3ImageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Home3ImageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
