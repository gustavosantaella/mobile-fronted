import 'dart:ui';

String lang(String key) {
  Map<String, Map<String, String>> languages = {
    "es": {
      "Loans":"Prestamos",
      "Debts": "Deudas",
      "loan": "prestamo",
      "Who?": "Deudor o prestamista",
      "Select a walle to assign Loan": "Selecciona una billetera para asocciar el prestamo",
      "loans":"prestamos",
      "My debts": "Mis deudas",
      "Description": "Descripcion",
      "Create and assign category": "Crear y asignar categoria",
      "My leans": "Mis prestamos",
      "debt": "deuda",
      "Update the status whe you know some advance about your loans.": "Actualiza el status del prestamo o dedua cuando estes seguro de hacerlo, esto te ayudara a tener un control sobre las personas que te deben algun dinero o a las personas a las que debes.",
      "Debotors": "Deudores",
      "debotors": "deudores",
      "Search": "Buscar",
      "You not have wallets": 'No tienes wallets',
      "Select a wallet to restore": "Selecciona una wallet",
      "Please wait a moment...": "Por favor espere un momento...",
      "Movements has been reset": "Tus wallets han sido restauradas",
      "Make login and get started to manager your finances with me": "Inicia sesion y empieza a gestionar tus finanzas de manera agil y sencilla",
      "Ey! Make login and get started": "Inicia sesion para gestioanr tus finanzas",
      "Ey! remeber to register a new finance": "Quizas quieres agregar algun nuevo movimiento?",
      "Register a new financing. If you manage your finances you can detect some flaws": "Recuerda que registrar tus finanzas es importante para que puedas detectar picos de botella y ademas puedas identificas cuales son tus mayores fuentes de ingresos y gastos",
      "Hey!, I'm sad": "Ey! No me haz usado en 30 minutos.",
      "You have not used me":"Recuerda que gestionar tus finanzas es importante para tu economia",
      "income":"Ingresos",
      'If you want to reset password, you can to insert a new password in  the following input, after that you can login whit your new password.': "Si quieres restablecer tu contraseña, puedes hacer uso del siguiente campo de entrada. Luego podras iniciar sesion con tu nueva contraseña",
      "Restore": "Restablecer",
      "This action is very dangerous because delete your finance history. Then you can register new finances again. \n\n This is very used to restore your history or if you need restore your balance.": "Esta accion es muy riesgosa porque elimina todas tu historial de finanzas. Si buscar restablecer tu historial o tu balance haga uso del siguiente boton.",
      "Anually": "Anualmente",
      "This feature is beign developed": "Esta funcionalidad esta siendo desarrollada",
      "Quarterly": "Trimestralmente",
      "New password": "Nueva contraseña",
      "Daily": "Diariamente",
      "Monthly": "Mensualmente",
      "Logout": "Cerrar sesion",
      "Change subscription":"Cambiar subscripcion",
      "Restore finances": "Restablecer finanzas",
      "Delete account": "Eliminar cuenta",
      "Schedule name": "Nombre de la programacion",
      "Check token": "Verificar codigo",
      "Next date":"Proxima fecha",
      "Cancel": "Cancelar",
      "expense":"Egresos",
      "Movements": "Movimientos",
      "Verification code": "Codigo de verificacion",
      "Get token": "Obtener codigo",
      "Schedules": "Programaciones",
      "Incomes": "Ingresos",
      "Forgot password": "Recuperar contrasena",
      "Expenses": "Egresos",
      "Amount":"Monto",
      "Calendar": "Calendario",
      "Type":"Tipo",
      "Category":"Categoria",
      "Provider":"Proveedor",
      "You can manage your finances with me": 'Empieza a manejar tus finanzas conmigo',
      "Register now":"Registrate ahora",
      "Just one step for you to start managing your finance":
          "A un solo paso de poder gestionar tus finanzas",
      "Country": 'Pais',
      "Password": 'Clave',
      "Email": "Correo",
      "Sign In": "Iniciar sesion",
      "Sign Up": "Registrarse",
      "Have an account?": "Tienes una cuenta?",
      "Reset password": "Restablecer clave",
      "metrics": "metricas",
      "expenses": "Egresos",
      "ADD MOVEMENT":"AGREGAR NUEVO MOVIMIENTO",
      "incomes": "Ingresos",
      "New movement": "nuevo movimiento",
      "add": 'agregar',
      'Welcome back': "bienvenido de vuelta",
      "hi": 'Hola',
      "Submit": "Enviar",
      "Dayli metric": "Metricas diarias",
      "email": "correo",
      "Profile": "Perfil",
      "Successfully": 'Hecho'
    },
    "en": {
      "Reset password": "Restablecer clave",
      "expenses": "Expenses",
      "incomes": "Incomes",
      "hi": "Hi",
      "new movement": "new movement",
      "add": "add"
    },
  };
  if (languages[window.locale.languageCode]?[key] != null) {
    return languages[window.locale.languageCode]?[key] as String;
  } else {
    return key;
  }
}
