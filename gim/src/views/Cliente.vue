<template>
  <div class="column">

	<div align="center">
        <form class="row g-3">
            <div align="center">
            <label for="inputState" class="form-label" >Tipo Usuario</label>
           <select id="inputState" class="form-select" >
                <option selected>Seleccione</option>
                <option value="cliente">Cliente</option>
                <option value="instructor">Instructor</option>
                <option value="coordinador">Coordinador</option>
            </select>
        </div>
        
    </form>

    <table class="table-bordered col-md-8"  align="center">
        <thead>
          <tr>
            <th scope="col">Nombre Usuario</th>
            <th scope="col">Contraseña</th>
            <th scope="col">Tipo Usuario</th>
            <th scope="col">Eliminar</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>Uno</td>
            <td>1</td>
            <td>Administrador</td>
            <td><a href="#">Eliminar</a></td>
          </tr>
          <tr>
            <td>Dos</td>
            <td>2</td>
            <td>Cliente</td>
            <td><a href="#">Eliminar</a></td>
          </tr>
          <tr>
            <td>Tres</td>
            <td>3</td>
            <td>Coordinador</td>
            <td><a href="#">Eliminar</a></td>
          </tr>
        </tbody>
      </table>

    </div>
  </div>
</template>

<script>

</script>
<style>

</style>
