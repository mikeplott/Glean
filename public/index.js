$(document).ready(function() {
    $('form').submit(function(event) {
        event.preventDefault();
        var uName = $('input[name=name]').val();
        var pass = $('input[name=pwd]').val();
      $.ajax({
          url: '/login',
          type: 'POST',
          contentType: 'application/json',
          data: JSON.stringify({
            userName:uName,
            password:pass}),
          success: function(data){
              console.log(data);
              alert(data);
            window.location.href="/dashboard.html";
          },
          error: function() {
            console.log("Get fucked");
          }
      });
    });
});
