import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserbloodtypeComponent } from './userbloodtype.component';

describe('UserbloodtypeComponent', () => {
  let component: UserbloodtypeComponent;
  let fixture: ComponentFixture<UserbloodtypeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserbloodtypeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserbloodtypeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
