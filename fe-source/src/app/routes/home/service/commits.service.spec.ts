import { TestBed } from '@angular/core/testing';

import { GetcommitsService } from './commits.service';

describe('GetcommittsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: GetcommitsService = TestBed.get(GetcommitsService);
    expect(service).toBeTruthy();
  });
});
