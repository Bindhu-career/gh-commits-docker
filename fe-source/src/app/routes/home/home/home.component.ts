import { Component, OnInit } from '@angular/core';
import { RootCommit } from '../modal/modal';
import { GetcommitsService } from '../service/commits.service';

@Component({
    selector: 'app-home',
    templateUrl: './home.component.html',
    styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

    public rootCommitts: RootCommit[];
    constructor(private getcommittsService: GetcommitsService) { }

    ngOnInit(): void {
        this.onRefresh();
    }
    onRefresh() {
        this.rootCommitts = null;
        this.getcommittsService.getCommits().subscribe((res) => {
            this.rootCommitts = res;
        }, (err) => {
        });
    }
}
