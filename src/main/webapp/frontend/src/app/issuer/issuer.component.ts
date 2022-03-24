import { Component, OnInit } from '@angular/core';
import {IssuerService} from "./issuer.service";
import {FormBuilder, Validators} from "@angular/forms";
import {saveAs} from 'file-saver';

@Component({
  selector: 'app-issuer',
  templateUrl: './issuer.component.html',
  styleUrls: ['./issuer.component.css']
})
export class IssuerComponent implements OnInit {

  issuers: any = [];
  filename: string ="";
  filterTerm!: string;
  showOnchange: boolean = false;

  constructor(private issuerService: IssuerService, private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.getAllIssuer();
  }


  getAllIssuer(){
    this.issuerService.getAllIssuer().subscribe(issuers => {
        this.issuers = issuers;
    });
  }


  downloadFile(){
    this.issuerService.downloadFile(this.filename).subscribe(file => saveAs(file, this.filename));
  }

  listOfIssuers(){
     console.log(this.filterTerm);
     this.showOnchange = true;
  }

  create(data: string){

  }

  update(data: string){

  }

  delete(data: string){

  }
}
