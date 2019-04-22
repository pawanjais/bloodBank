import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserbloodbankComponent } from './userbloodbank.component';

describe('UserbloodbankComponent', () => {
  let component: UserbloodbankComponent;
  let fixture: ComponentFixture<UserbloodbankComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserbloodbankComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserbloodbankComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
