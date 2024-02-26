import { Component, OnInit } from '@angular/core';
import { MarcasCarroEnum } from '../enum/marca-enum';
import { VeiculosService } from '../Service/veiculos.service';


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
    this.verificarMarcaExiste();
    this.veiculoService.adicionarVeiculo(this.veiculo).subscribe(
      (response) => {
        console.log('Veículo adicionado com sucesso!', response);
      },
      (error) => {
      }
    );
  }
  verificarMarcaExiste(){
    if (!Object.values(MarcasCarroEnum).includes(this.veiculo.marca)) {
      alert('Marca inválida. Escolha uma das marcas permitidas.');
      return;
    };
  }
}

