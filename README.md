# consulta-servicio
Consulta por el RUC de una empresa.

String apiKey = "PNVn0DEQiy9iKsG7yO7al1c9vjVZBabi1UIhEqAP";

        ApiConsultaRuc api = ApiServices.apiRuc();
        EntityResponse entityResponse = api.basic(
                apiKey,
                Ruc.of("20600567013")
        ).execute().body();

        System.out.println("entity: " + entityResponse);
        
# Respuesta      
{
  "success": true,
  "message": "Ruc encontrado",
  "item":{
    "_id": "20600567013",
    "name": "FIT CODERS S.R.L.",
    "state": "ACTIVO",
    "condition": "HABIDO",
    "ubigeo": "100601",
    "address": "SAN MIGUEL CASTILLO GRANDE Lt. 12 Mz. 07 "
  }
}
