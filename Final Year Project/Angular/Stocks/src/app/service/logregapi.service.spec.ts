import { TestBed } from '@angular/core/testing';

import { LogregapiService } from './logregapi.service';

describe('LogregapiService', () => {
  let service: LogregapiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LogregapiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
