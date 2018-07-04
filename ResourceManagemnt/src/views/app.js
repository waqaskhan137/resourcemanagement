
var app = angular.module('myApp',[]);

app.controller('getResourceController', getResourceController);

function getResourceController($scope){

alert("In controller");

     $scope.resources = function(){

        alert("in resource");
            $.ajax({url: "https://jsonplaceholder.typicode.com/posts/2", success: function(result){
                // alert(result.id);
                var resultInJson = angular.fromJson(result);
                // alert(resultInJson.body);
                return resultInJson;
            }});
    }
}

app.service('getResourceService', function(){

    // var getResource = "http://localhost:8080/resource/2";
    var getResource = "https://jsonplaceholder.typicode.com/posts/2";


});
