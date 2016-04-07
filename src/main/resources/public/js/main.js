$(document).ready(function () {

    $("#enviar").click(function () {
        var values = $("form#valores").serialize();
        console.log(values);
        $.ajax({
            url: "/calcular",
            type: "post",
            data: values,
            type: "text",
            success: function(response) {
                alert("responde");
            }
        }).done(function (msg) {

                alert("mensaje");
        })
    });
})
