<template>
  <div id="app" class="container">
    <div class="login-box" v-if="resultado == '' || resultado == 'error'">
      <img src="./assets/logo.png" class="avatar" alt="Avatar Image" />
      <h1>Ingreso</h1>
      <form v-on:submit="onSubmit">
        <label for="username">Nombre de usuario</label>
        <input
          type="text"
          class="form-control"
          id="usuario"
          v-model="form.nombre_usuario"
        />

        <label for="password">Contraseña</label>
        <input
          type="password"
          class="form-control"
          id="contrasenaUsuario"
          v-model="form.password_usuario"
        />
        <button type="submit">Enviar</button>
      </form>
    </div>
    <div v-else>
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">{{ textIzq }}</a>
          <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarText"
            aria-controls="navbarText"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarText">
            <ul class="navbar-nav mb-2 mb-lg-0">
              <div v-if="resultado == 'cliente'">
                <li class="nav-item" v-on:click="cambiarMensajeIzq('Inicio')">
                  <router-link to="/cliente" class="nav-link">Inicio</router-link>
                </li>
              </div>
              <div v-if="resultado == 'cliente'">
                <li
                  class="nav-item"
                  v-on:click="cambiarMensajeIzq('ConsultarHorarios')"
                >
                  <router-link to="/cliente" class="nav-link"
                    >Consultar Horarios</router-link
                  >
                </li>
              </div>
              <div v-if="resultado == 'administrador'">
                <li
                  class="nav-item"
                  v-on:click="cambiarMensajeIzq('Consultar Usuarios')"
                >
                  <router-link to="/cliente" class="nav-link"
                    >Consultar Usuarios</router-link
                  >
                </li>
              </div>
              <div v-if="resultado == 'administrador'">
                <li
                  class="nav-item"
                  v-on:click="cambiarMensajeIzq('Crear Usuarios')"
                >
                  <router-link to="/cliente" class="nav-link"
                    >Crear Usuarios</router-link
                  >
                </li>
              </div>
              <div v-if="resultado == 'coordinador'">
                <li
                  class="nav-item"
                  v-on:click="cambiarMensajeIzq('Crear Clases')"
                >
                  <router-link to="/cliente" class="nav-link"
                    >Crear Clases</router-link
                  >
                </li>
              </div>
              <div v-if="resultado == 'coordinador'">
                <li
                  class="nav-item"
                  v-on:click="cambiarMensajeIzq('Crear Usuarios')"
                >
                  <router-link to="/cliente" class="nav-link"
                    >Crear Usuarios</router-link
                  >
                </li>
              </div>
              <div v-if="resultado == 'coordinador'">
                <li
                  class="nav-item"
                  v-on:click="cambiarMensajeIzq('Crear Horarios')"
                >
                  <router-link to="/cliente" class="nav-link"
                    >Crear Horarios</router-link
                  >
                </li>
              </div>
              <div v-if="resultado == 'coordinador'">
                <li
                  class="nav-item"
                  v-on:click="cambiarMensajeIzq('Crear Horarios')"
                >
                  <router-link to="/cliente" class="nav-link"
                    >Crear Horarios</router-link
                  >
                </li>
              </div>
              <div v-if="resultado == 'instructor'">
                <li
                  class="nav-item"
                  v-on:click="cambiarMensajeIzq('Consultar Usuarios')"
                >
                  <router-link to="/cliente" class="nav-link"
                    >Consultar usuarios</router-link
                  >
                </li>
              </div>

              <div v-else>
                <li class="nav-item" v-on:click="cambiarMensajeIzq('Reportes')">
                  <router-link to="/cliente" class="nav-link"
                    >Reportes</router-link
                  >
                </li>
              </div>
              <li class="nav-item">
                <a class="nav-link" v-on:click="salir">Salir</a>
              </li>
            </ul>
            <span class="navbar-text ms-auto">
              GIMNASIO LA ARENA DEL SUDOR
            </span>
          </div>
        </div>
      </nav>
      <router-view />
    </div>
  </div>
</template>

<script>
//import axios from 'axios'
import router from "./router";
import axios from "axios";
axios.defaults.headers.common["Access-Control-Allow-Origin"] = "*";
axios.defaults.withCredentials = false;
axios.defaults.crossDomain = false;

export default {
  data: function () {
    return {
      form: {
        nombre_usuario: "",
        password_usuario: "",
      },
      resultado: "",
      textIzq: "Cliente",
    };
  },
  methods: {
    onSubmit(event) {
      event.preventDefault();
      axios
        .post("http://localhost:8080/login/", JSON.stringify(this.form), {
          headers: {
            Accept: "application/json",
            "Content-Type": "application/json",
          },
        })
        .then((res) => {
          this.resultado = res.data;
          /*if (res.data == "error") {
            alert("Revise el usuario y la contraseña");
          } else {
            if (res.data == "cliente") {
              router.push({ path: "/Cliente" });
            } else if (res.data == "cliente") {
              router.push({ path: "/Cliente" });
            } else if (res.data == "cliente") {
              router.push({ path: "/Cliente" });
            } else if (res.data == "cliente") {
              router.push({ path: "/Cliente" });
            } else if (res.data == "cliente") {
              router.push({ path: "/Cliente" });
            } else {
              router.push({ path: "/reportes" });
            }
          }*/
        });

      this.resultado = "cliente";
      router.push({ path: "/Cliente" });
    },
  },
  salir() {
    this.resultado = "";
  },
  cambiarMensajeIzq(text) {
    this.textIzq = text;
  },
};
</script>


<style>
@import "./assets/style.css";
</style>