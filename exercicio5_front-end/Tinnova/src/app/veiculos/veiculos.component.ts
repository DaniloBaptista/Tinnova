import { Component, OnInit } from '@angular/core';
import { VeiculosService } from './veiculos.service';

@Component({
  selector: 'app-veiculos',
  templateUrl: './veiculos.component.html',
  styleUrls: ['./veiculos.component.css']
})
export class VeiculosComponent implements OnInit {
  veiculo: any = {
    marca: '',
    veiculo: '',
    ano: null,
    descricao: '',
    vendido: null,
    cor: ''
  };

  constructor(private veiculoService: VeiculosService) { }

  ngOnInit(): void {
  }

  submitForm() {
    this.veiculoService.adicionarVeiculo(this.veiculo).subscribe(
      (response) => {
        console.log('Veículo adicionado com sucesso!', response);
      },
      (error) => {
      }
    );
  }
}

