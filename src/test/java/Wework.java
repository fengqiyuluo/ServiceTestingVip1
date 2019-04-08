import io.restassured.RestAssured;

public class Wework {
    public String getToken(){
        return RestAssured.given().log().all()
                .queryParam("corpid", WeworkConfig.getInstance().corpid)
                .queryParam("corpsecret", WeworkConfig.getInstance().Secret)
                .when().get("https://qyapi.weixin.qq.com/cgi=bin/gettoken")
                .then().log().all().statusCode(404).log().all()
                .extract().path("access_token");
    }
}
