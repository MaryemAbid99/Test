import { Injectable } from '@angular/core';
import { HttpEvent, HttpInterceptor, HttpHandler, HttpRequest } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {
  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    const token = localStorage.getItem('auth_token');
    if (token) {
      const cloned = req.clone({
        setHeaders: {
          Authorization: 'Bearer ${token}',
        },
      });
      return next.handle(cloned);
    } else {
      return next.handle(req);
    }
  }
}
