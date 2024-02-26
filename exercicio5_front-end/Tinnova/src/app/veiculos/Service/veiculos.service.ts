import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VeiculosService {
  private apiUrl = 'http://localhost:8080/api/veiculos';

  constructor(private http: HttpClient) { }

  adicionarVeiculo(veiculo: any): Observable<any> {
      return this.http.post(this.apiUrl, veiculo, {
      headers: { 'Content-Type': 'application/json' }
    });
    //return this.http.post(this.apiUrl, veiculo, Headers);
  }
}

