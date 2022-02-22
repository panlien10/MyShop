$(function () {
    var loginName=$.cookie('loginName');
    var password=$.cookie('password');

    if(loginName!=""&&password!=""){
        $("#remember-me").prop("checked",true);
        $("#loginName").val(loginName);
        $("#password").val(password);
    }
});

$("#btn_login").click(function () {

    var loginName=$("#loginName").val();
    var password=$("#userpass").val();

    if(loginName==""||password==""){
        $("#msg").html("登录名称或密码不能为空！");
        return;
    }

    var remember_me=$("#remember-me").prop("checked");

    if(remember_me){
        $.cookie('loginName',loginName, { expires: 7 });
        $.cookie('password',password, { expires: 7 });
    }

    $("#loginForm").submit();
});