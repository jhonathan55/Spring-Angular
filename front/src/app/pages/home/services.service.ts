import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { environment } from 'src/environments/environment';
import { MovimientosI } from './movimientos-interface';

@Injectable({
  providedIn: 'root'
})
export class ServicesService {

  constructor(
    private http: HttpClient,

  ) { }

  newMovimiento(movimiento: MovimientosI):Observable<any|void> {
    return this.http.post<any>(environment.baseUrl+'movimientos', movimiento).pipe(
      map((resp: any) => {
        return resp;
      })
    )
  }


}
