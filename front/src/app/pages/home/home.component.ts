import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { ServicesService } from './services.service';
import { MovimientosI } from './movimientos-interface';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(
    private service: ServicesService,
    private fb: FormBuilder

  ) { }
  form = this.fb.group({
    tipo: ['', Validators.required],
    cantidad: ['', Validators.required],
    saldo: ['', Validators.required]
  })

  ngOnInit(): void {
    // const movimiento = {
    //   tipo: 'Egreso',
    //   cantidad: 100,
    //   saldo: 100  
    // }
    // this.service.newMovimiento(movimiento).subscribe(resp => {
    //   console.log(resp);
    // })
  }

  onSaveMovimiento() {
    const valForm: MovimientosI = {
      tipo: this.form.value.tipo,
      cantidad: parseInt(this.form.value.cantidad),
      saldo: parseInt(this.form.value.saldo)
    };
    this.service.newMovimiento(valForm).subscribe((res) => {
      if (res) {
        Swal.fire(
          'Registro exitoso!',
          'success'
        )
        this.form.reset();
      }
    })
  }
  //valida los input
  isValidField(field: string): string {
    const validatedField = this.form.get(field);
    return (!validatedField?.valid && validatedField?.touched) ? 'is-invalid' : validatedField?.touched ? 'is-valid' : '';
  }














}
