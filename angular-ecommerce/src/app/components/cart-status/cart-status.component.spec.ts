import { async, ComponentFixture, TestBed } from "@angular/core/testing";

import { CartStatusComponent } from "./cart-status.component";

describe("CartStatusComponent", () => {
  let component: CartStatusComponent;
  let fixture: ComponentFixture<CartStatusComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [CartStatusComponent],
    }).compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CartStatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it("should create", () => {
    expect(component).toBeTruthy();
  });
});
