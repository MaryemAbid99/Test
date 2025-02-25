import { Component } from '@angular/core';
import { AuthService } from '../../auth/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  credentials = {
    username: '',
    password: ''
  };

  constructor(private authService: AuthService, private router: Router) {}

  onSubmit() {
    // Appel au service de connexion
    this.authService.login(this.credentials).subscribe(
      (response: any) => {
        // Sauvegarder le token dans le localStorage
        this.authService.saveToken(response.token);

        // Récupérer les rôles de l'utilisateur depuis la réponse
        const roles = response.roles; // Liste des rôles renvoyée par le backend

        // Vérifier le rôle de l'utilisateur et rediriger en conséquence
        if (roles.includes('ADMIN')) {
          this.router.navigate(['/admin']); // Rediriger vers /admin si l'utilisateur est un ADMIN
        } else if (roles.includes('USER')) {
          this.router.navigate(['/']); // Rediriger vers la page d'accueil si l'utilisateur est un USER
        } else {
          console.error('Rôle non reconnu'); // Gestion des rôles inconnus
        }
      },
      (error: any) => {
        // Gérer les erreurs d'authentification (ex: mauvais mot de passe)
        console.error('Erreur d\'authentification', error);
      }
    );
  }

}
