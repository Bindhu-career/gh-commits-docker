import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import {Observable} from 'rxjs/Observable';
import { RootCommit } from '../modal/modal';
@Injectable({
  providedIn: 'root'
})
export class GetcommitsService {

  constructor(private http: HttpClient) { }

  getCommits() {
    return this.http.get<RootCommit[]>('/api/getAllCommits');
  }
}
