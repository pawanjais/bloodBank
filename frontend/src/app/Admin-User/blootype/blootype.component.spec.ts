import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BlootypeComponent } from './blootype.component';

describe('BlootypeComponent', () => {
  let component: BlootypeComponent;
  let fixture: ComponentFixture<BlootypeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BlootypeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BlootypeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
