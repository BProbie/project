$(function main() {
    $(".search").keydown(function down(event) {
        event=(event)?event:((window.event)?window.event:"");
        let keyCode=event.keyCode?event.keyCode:(event.which?event.which:event.charCode);
        let altKey = event.ctrlKey || event.metaKey;
        if(keyCode === 13 && altKey){
            let newDope=$(this).val()+"\n";
            $(this).val(newDope);
        }else if(keyCode==13){
            search(null)
            event.preventDefault();
        }

    });

    function search(type){
        alert("暂未启用")
    }
})