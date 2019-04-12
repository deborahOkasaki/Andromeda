function validarEmail(email) {
    var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(email);
  }

  function validar() {
    var $result = $("#result");
    var email = $("#email").val();
    $result.text("");

    if (validarEmail(email)) {
      $result.text();
      $result.css("color", "green");
    } else {
      $result.text("Usuário ou senha inválidos! Tente novamente.");
      $result.css("color", "#F4F192");
    }
    return false;
  }

  function validarSenha(senha) {
    var re = /^[A-Za-z0-9]{5,}$/;
    return re.test(senha);
  }

  function validar() {
    var $result = $("#result");
    var senha = $("#senha").val();
    $result.text("");

    if (validarSenha(senha)) {
      $result.text();
      $result.css("color", "green");
    } else {
      $result.text("Usuário ou senha inválidos! Tente novamente.");
      $result.css("color", "#F4F192");
    }
    return false;
  }

   $("#validar").bind("click", validar);

	// Máscaras de Input
   $(function() {
     $("#campo-horas").mask("99:99", { placeholder: "hh:mm" });
	 $("#campo-data").mask("99/9999", { placeholder: "mm/aaaa" });
  });
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
