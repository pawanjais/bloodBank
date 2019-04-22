import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserdashnavComponent } from './userdashnav.component';

describe('UserdashnavComponent', () => {
  let component: UserdashnavComponent;
  let fixture: ComponentFixture<UserdashnavComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserdashnavComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserdashnavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
