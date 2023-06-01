// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarUsuarios();
  $('#usuarios').DataTable();
});

/**

async function cargarUsuarios() {
fetch('usuarios', {
    method: 'GET',
    headers: {
        "Content-Type": "application/json",
    },
})
.then(res => res.json())
.then(res=> {
      console.log(res);


**/

async function cargarUsuarios() {

const request = await fetch('usuarios',{
    method:'GET',
    headers:{
        'Accept':'application/json',
        'Content-Type':'application/json'
    }

});
const usuarios = await request.json();

console.log(usuarios);
// vamos a cargar los usuarios del controlador a nuestros datos del html
//recorremos los datos del html del servidor


let listadoHtml = '';
  for (let usuario of usuarios) {
    let botonEliminar = '<a href="#" onclick="eliminarUsuario(' + usuario.id + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
    let telefonoTexto = usuario.telefono ? usuario.telefono : ''; // Asumiendo que existe la propiedad 'telefono' en el objeto 'usuario'

    let usuarioHtml = '<tr><td>' + usuario.id + '</td><td>' + usuario.nombre + ' ' + usuario.apellido + '</td><td>' +
      usuario.email +'</td><td>' + telefonoTexto + '</td><td>' + botonEliminar + '</td></tr>';

    listadoHtml += usuarioHtml;
  }


document.querySelector('#usuarios tbody').outerHTML = listadoHtml;


};