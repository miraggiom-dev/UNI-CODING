## CLASE ENSAYO CLÍNICO

from datetime import datetime

class EnsayoClinico:

	## Constructor
	def __init__(self):
		self.id_paciente = self.idPaciente()
		self.grupo_tratamiento = self.grupoTratamiento()
		self.edad = self.edad()
		self.peso = self.peso()
		self.dosis = self.dosis()
		self.fecha_ingreso = self.fechaIngreso()
		self.fecha_seguimiento = self.fechaSeguimiento()
		self.estado_paciente = self.estadoPaciente()
		self.resultado_prueba = self.resultadoPrueba()
		self.evaluar_eficacia()
		self.validacion = self.validacion()

	## Métodos

	@staticmethod
	def idPaciente():
		id_paciente = int(input("Ingrese el ID del paciente (número entero positivo): "))
		try:
			if id_paciente > 0:
				return id_paciente
		except ValueError:
			return None

	@staticmethod
	def grupoTratamiento():
		grupo_tratamiento = input("Ingrese el grupo de tratamiento del paciente (A, B, C, Placebo): ")
		if grupo_tratamiento in ["A", "B", "C", "Placebo"]:
			return grupo_tratamiento
		else:
			return None

	@staticmethod
	def edad():
		edad_paciente = int(input("Ingrese la edad del paciente (comprendido entre 18 y 80): "))
		try:
			if 18 <= edad_paciente <= 80:
				return edad_paciente
		except ValueError:
			None

	@staticmethod
	def peso():
		peso_paciente = float(input("Ingrese el peso del paciente (comprendido entre 40 y 120kg): "))
		try:
			if 40 <= peso_paciente <= 120:
				return peso_paciente
		except ValueError:
			return None

	@staticmethod
	def dosis():
		dosis_paciente = float(input("Ingrese la dosis del paciente (comprendido entre 25 y 300mg): "))
		try:
			if 25 <= dosis_paciente <= 300:
				return dosis_paciente
		except ValueError:
			return None

	@staticmethod
	def fechaIngreso():
		fecha_ingreso = input("Ingrese la fecha del ingreso del paciente (siguiendo el formato YYYY-MM-DD): ")
		try:
			fecha_ingreso_valida = datetime.strptime(fecha_ingreso, "%Y-%m-%d")
			if fecha_ingreso_valida <= datetime.now():
				return fecha_ingreso_valida
		except ValueError:
			return None

	@staticmethod
	def fechaSeguimiento():
		fecha_seguimiento = input("Ingrese la fecha del seguimiento del paciente (siguiendo el formato YYYY-MM-DD): ")
		try:
			fecha_seguimiento_valida = datetime.strptime(fecha_seguimiento, "%Y-%m-%d")
			if fecha_seguimiento_valida <= fecha_ingreso:
				return fecha_seguimiento_valida
		except ValueError:
			return None

	@staticmethod
	def estadoPaciente():
		estado_paciente = int(input("Ingrese el estado del paciente (0 = abandonó, 1 = activo, 2 = completado): "))
		try:
			if estado_paciente == 0 or estado_paciente == 1 or estado_paciente == 2:
				return estado_paciente
		except ValueError:
			return None

	@staticmethod
	def resultadoPrueba():
		resultado_prueba = float(input("Ingrese el resultado de la prueba (comprendido entre 0 y 100%): "))
		try:
			if 0 <= resultado_prueba <= 100:
				return resultado_prueba
		except ValueError:
			return None

	@staticmethod
	def evaluar_eficacia():
		evaluar_eficacia = resultado_prueba
		if evaluar_eficacia >= 70:
			print("Eficaz.")
		elif evaluar_eficacia >= 50:
			print("Moderada.")
		elif evaluar_eficacia < 50:
			print("Baja.")

	@staticmethod
	def validacion():
		if (self.id_paciente is None or
			self.grupo_tratamiento is None or
			self.edad is None or
			self.peso is None or
			self.dosis is None or
			self.fecha_ingreso is None or
			self.fecha_seguimiento is None or
			self.estado_paciente is None or
			self.resultado_prueba is None):
			return False
		return True

	def __str__(self):
		if self.validacion():
			return f'{self.id_registro};{self.grupo_tratamiento};{self.edad};{self.peso};{self.dosis};{self.fecha_ingreso};{self.fecha_seguimiento};{self.estado_paciente};{self.resultado_prueba}'
		else:
			return None

## MANIPULADOR

class Manipulador:

	def __init__(self, path):
		self.path = path
		self.verificar_archivo()

	def verificar_archivo(self):
		with open(self.path, "a"):
			pass
		print("El archivo fue verificado correctamente.")

	def obtener_registros(self):
		with open(self.path, "r") as archivo:
			archivo.readlines()

	def leer_todo(self):
		with open(self.path, "r") as archivo:
			print(archivo.read())

	def escribir_registro(self, registro, sobreescribir = False):
		with open(self.path, "w" if sobreescribir else "a") as archivo:

## MAIN

m = Manipulador("ensayos_clinicos_avanzados.txt")

while True:
	print()

	print(" --- Menú de opciones ---\n",
		"\n1. Verificar archivo.",
		"\n2. Crear ensayo.",
		"\n3. Leer ensayo.",
		"\n4. Buscar ensayo.",
		"\n5. Eliminar ensayo.",
		"\n6. Estadísticas.",
		"\n7. Identificación de pacientes en riesgo.",
		"\n8. Salir.")

	opcion = int(input("\nIngrese su opción: "))

	match (opcion):

		case "1":
			print(" --- Verificador de archivo ---")
			m.verificar_archivo()

		case "2":
			print(" --- Creador de nuevo ensayo ---")
			m.escribir_registro()

		case "3":
			print(" --- Lector de todos los ensayos ---")
			m.leer_todo()

		case "8":
			print(" --- Saliendo del programa ---")
			break

		case _:
			break