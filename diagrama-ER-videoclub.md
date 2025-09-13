# Diagrama E-R Videoclub

## Entidades

- **Cliente**
  - ID
  - Nombre
  - Apellido
  - Email
  - Teléfono

- **Película**
  - ID
  - Título
  - Género
  - Año
  - Precio de Alquiler

- **Alquiler**
  - ID
  - Fecha de Alquiler
  - Fecha de Devolución

## Relaciones

- Un **Cliente** puede alquilar varias **Películas**.
- Una **Película** puede ser alquilada por varios **Clientes** a lo largo del tiempo.
- Un **Alquiler** está asociado a un único **Cliente** y a una única **Película**.