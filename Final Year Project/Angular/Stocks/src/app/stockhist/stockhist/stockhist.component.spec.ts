import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StockhistComponent } from './stockhist.component';

describe('StockhistComponent', () => {
  let component: StockhistComponent;
  let fixture: ComponentFixture<StockhistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StockhistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StockhistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
