import { TestBed } from '@angular/core/testing';

import { CustomvalService } from './customval.service';

describe('CustomvalService', () => {
  let service: CustomvalService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CustomvalService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
