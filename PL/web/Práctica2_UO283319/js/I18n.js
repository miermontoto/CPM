function checkLang() {
    var userLang = navigator.language || navigator.userLanguage;
    if(userLang.indexOf("es") == -1) window.location.href = "index_en.html";
}

// Cualquier función cumple ReqI11 porque se utilizan formatos dependientes del idioma,
// ya que se utiliza el locale en el idioma de la página (lang).

function updateDateHint(idDate, idHint) {
    var dateHint = document.getElementById(idHint);
    var date = document.getElementById(idDate);

    dateHint.innerHTML = dateFullFormat.format(date.valueAsDate); // ReqF18
}

function updateCálculo(idNum1, idOp, idNum2, idSpan, idResultado, idMoneda) { // ReqI12
    var num1 = document.getElementById(idNum1);
    var num2 = document.getElementById(idNum2);
    var op = document.getElementById(idOp);
    var span = document.getElementById(idSpan);
    var moneda = document.getElementById(idMoneda);

    span.innerHTML = numberFormat.format(num1.valueAsNumber) + " " + op.value + " " + numberFormat.format(num2.valueAsNumber); // ReqI13
    var resultado = eval(num1.valueAsNumber + op.value + num2.valueAsNumber)
    document.getElementById(idResultado).innerHTML = numberFormat.format(resultado); // ReqI8
    moneda.innerHTML = currencyFormat.format(resultado); // ReqI9, ReqI14
}

function calcularFecha(idFecha, idOp, idNum, idSpan, idResultado, idMod) { // ReqI12
    var fecha = document.getElementById(idFecha);
    var op = document.getElementById(idOp);
    var num = document.getElementById(idNum);
    var span = document.getElementById(idSpan);
    var resultado = document.getElementById(idResultado);
    var mod = document.getElementById(idMod);

    span.innerHTML = dateShortFormat.format(fecha.valueAsDate) + " " + op.value + " " + numberFormat.format(num.valueAsNumber) + " " + mod.value; // ReqI15
    var fechaResultado = new Date(fecha.valueAsDate);
    switch(mod.value) {
        case "días":
            fechaResultado.setDate(eval(fechaResultado.getDate() + op.value + num.valueAsNumber));
            break;
        case "meses":
            fechaResultado.setMonth(eval(fechaResultado.getMonth() + op.value + num.valueAsNumber));
            break;
        case "años":
            fechaResultado.setFullYear(eval(fechaResultado.getFullYear() + op.value + num.valueAsNumber));
            break;
    }
    resultado.innerHTML = dateFullFormat.format(fechaResultado); // ReqI10, ReqI16
}