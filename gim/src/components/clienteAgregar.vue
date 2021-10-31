<template>
    <div>
    <form v-on:submit="onSubmit">
        <div class="form-floating mb-3">
            <input v-model="form.nombre_estudiante" class="form-control" type="text" id="pnombre">
            <label for="pnombre">Primer Nombre</label>
        </div>
        
        <div class="form-floating mb-3">
            <input v-model="form.segnombre_estudiante" class="form-control" type="text" id="snombre">
            <label for="snombre">Segundo Nombre</label>
        </div>
        
        <div class="form-floating mb-3">
            <input v-model="form.apellido_estudiante" class="form-control" type="text" id="papellido">
            <label for="papellido">Primer Apellido</label>
        </div>

        <div class="form-floating mb-3">
            <input v-model="form.segapellido_estudiante" class="form-control" type="text" id="sapellido">
            <label for="sapellido">Segundo Apellido</label>
        </div>

        <div class="form-floating mb-3">
            <input v-model="form.direccion_estudiante" class="form-control" type="text" id="direccion">
            <label for="direccion">Dirección</label>
        </div>

        <div class="form-floating mb-3">
            <input v-model="form.telefono_estudiante" class="form-control" type="number" id="telefono">
            <label for="telefono">Teléfono</label>
        </div>

        <div class="form-floating mb-3">
            <input v-model="form.anio_estudiante" class="form-control" type="number" id="anio_estudiante">
            <label for="anio_estudiante">año</label>
        </div>

        <div class="form-floating mb-3">
            <input v-model="form.barrio_estudiante" class="form-control" type="text" id="barrio">
            <label for="barrio">Barrio</label>
        </div>

        <select class="form-select" v-model="form.profesor_id_profesor.id_profesor">
            <option v-for="docente in docentes" :key="docente.id_profesor" :value="docente.id_profesor">{{docente.nombre_profesor}} {{docente.apellido_profesor}}</option>
        </select>
        <br>
        <br>
        <br>
        <br>
        <div v-if="estudianteEditarId>0">
            <button type="submit" class="btn btn-primary" id="basicToastBtn">Actualizar</button>
        </div>
        <div v-else>
            <button type="submit" class="btn btn-primary" id="basicToastBtn">Guardar</button>
        </div>
    </form>
    <div :style="estadoMsgInf" class="position-fixed top-0 end-0 p-3">
        <div role="alert" aria-live="assertive" aria-atomic="true">
            <div class="toast-header bg-primary text-light">
                <h5 class="my-0">{{ mensajeInfo }}</h5>
            </div>
        </div>  
    </div>
    </div>
</template>

<script>
    import axios from 'axios'
    export default {
    name: 'estudianteAgregar',
    props: {
        estudianteEditarId: Number
    },
    data: function () {
      return {
        form: {
          id_estudiante: 0,
          nombre_estudiante: '',
          segnombre_estudiante: '',
          apellido_estudiante: '',
          segapellido_estudiante: '',
          direccion_estudiante: '',
          anio_estudiante: '',
          telefono_estudiante: '',
          barrio_estudiante: '',
          profesor_id_profesor: {
              id_profesor: 0
          }
        },
        docentes: [],
        mensajeInfo: 'Se guardó correctamente',
        estadoMsgInf: 'display: none;'//Que no lo muestre
      }
    },
    methods: {
        onSubmit(event) {
            event.preventDefault()
            if (this.verificarCampos()) {
                alert("Verifique que todos los campos esten llenos")
            } else {
                if(this.estudianteEditarId<0){
                    this.guardarEstudiante()
                }else{
                    this.editarEstudiante()
                }   
            }
            this.form.nombre_estudiante= '',
            this.form.segnombre_estudiante= '',
            this.form.apellido_estudiante= '',
            this.form.segapellido_estudiante= '',
            this.form.direccion_estudiante= '',
            this.form.anio_estudiante= '',
            this.form.telefono_estudiante= '',
            this.form.barrio_estudiante= '',
            this.form.profesor_id_profesor.id_profesor= 0
        },
        getDocentes() {
            axios.get("http://localhost:8080/docente/")
            .then(res => {  
                this.docentes = res.data
            })
            .catch(err => {
                alert(err); 
            })
        },
        traerDatosEstudiante() {
            axios.get("http://localhost:8080/estudiante/"+this.estudianteEditarId)
            .then(res => {  
                this.form = {
                    nombre_estudiante: res.data.nombre_estudiante,
                    segnombre_estudiante: res.data.segnombre_estudiante,
                    apellido_estudiante: res.data.apellido_estudiante,
                    segapellido_estudiante: res.data.segapellido_estudiante,
                    direccion_estudiante: res.data.direccion_estudiante,
                    anio_estudiante: res.data.anio_estudiante,
                    telefono_estudiante: res.data.telefono_estudiante,
                    barrio_estudiante: res.data.barrio_estudiante,
                    profesor_id_profesor: {
                        id_profesor: res.data.profesor_id_profesor.id_profesor
                    }
                }
            })
            .catch(err => {
            alert(err); 
            })
             },
        guardarEstudiante(){
            axios.post("http://localhost:8080/estudiante/",JSON.stringify(this.form),{
            headers: { 
                'Accept': 'application/json',
                'Content-Type': 'application/json' 
            },
            })
            .then(() => {  
                this.estadoMsgInf= 'display: block;'
            })
            .catch(err => {
                alert(err); 
            })
        },
        editarEstudiante(){
            this.form.id_estudiante = this.estudianteEditarId
            axios.post("http://localhost:8080/estudiante/",JSON.stringify(this.form),{
            headers: { 
                'Accept': 'application/json',
                'Content-Type': 'application/json' 
            },
            })
            .then(res => {  
                console.log(res);
                this.estadoMsgInf= 'display: block;'//Mostrarlo
            })
            .catch(err => {
                alert(err); 
            })
        },
        verificarCampos(){
            return this.form.nombre_estudiante==''||
            this.form.segnombre_estudiante==''||
            this.form.apellido_estudiante==''||
            this.form.segapellido_estudiante==''||
            this.form.direccion_estudiante==''||
            this.form.anio_estudiante==''||
            this.form.telefono_estudiante==''||
            this.form.barrio_estudiante==''||
            this.form.profesor_id_profesor.id_profesor==0
        },
        mostrarMensaje(text){
            this.mensajeInfo = text
        }
    },
    mounted() {
      this.getDocentes() //método que actualiza la tabla.
      if (this.estudianteEditarId != 0) {
          //Si voy actualizar traer datos, porque el props es de quien señaló,
          //a qué id va actualizar.
          this.traerDatosEstudiante()
      }
    }
  }
</script>

<style>

</style>