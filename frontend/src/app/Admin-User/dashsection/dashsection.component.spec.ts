import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DashsectionComponent } from './dashsection.component';

describe('DashsectionComponent', () => {
  let component: DashsectionComponent;
  let fixture: ComponentFixture<DashsectionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DashsectionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DashsectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
