$(document).ready(function () {

    $("#summernote").summernote({
        height: 523,
        maxHeight: 523,
        minHeight: 523,
        lang: "ko-KR",
        placeholder : '내용을 작성해 주세요!',
        callbacks: {
            onImageUpload: function(files, editor, welEditable) {
                for(var i = files.length -1; i>=0; i--) {
                    sendFile(files[i], this);
                }
            }
        }
    });

    console.log($(location).attr("pathname"));

    if($(location).attr("pathname") == "/member/myPostModifyRead"){
        // 값 들어왔는지 확인
        console.log(content);
        // 썸머노트에 값 불러오기
        $("#summernote").summernote('code',content);
    }

    let $registerBtn = $(".write_register");

    // 저장버튼 클릭
    $registerBtn.on("click",function(){
            saveContent();
        }
    )
});