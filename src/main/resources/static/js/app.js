$(document).ready(function() {
    //让滚动条固定从底部开始
    $(function() {
        $("html, body").animate({ scrollTop: $(document).height() }, "fast");
    });
});

$("#sm").click(function () {
    var chatId = $("#chatId").val();
    if (chatId == '') {
        alert("请选择会话！")
        return false;
    }
    var content = $("#content").val();
    if (content == '') {
        alert("请输入信息！")
        return false;
    }

    $(function() {
        $("html, body").animate({ scrollTop: $(document).height() }, "fast");
    });
    if ($("#chatWindow").children("p:last-child").length) {
        $("#chatWindow").children("p:last-child").after("<p class='message0'>"+$("#content").val()+"-user</p>");
    } else {
        $("#chatWindow").prepend("<p class='message0'>"+$("#content").val()+"-user</p>");
    }
    $.ajax({
        url: "http://localhost:8080/ajax",
        data: {"chatId":chatId,"content":content},
        type: "post",
        dataType: "json",
        success: function (data) {
            $(function() {
                $("html, body").animate({ scrollTop: $(document).height() }, "fast");
            });
            $("#chatWindow").children("p:last-child").after("<p class='message1' id='gpt-msg'></p>");
            //打字效果
            var typed = new Typed("#gpt-msg", {
                strings:["GPT-"+data.content],
                typeSpeed: 10,
                backSpeed: 10,
                backDelay: 1000,
                loop: false
            });
        },
        error: function () {
            alert("服务器发生了错误");
        }
    });
});


