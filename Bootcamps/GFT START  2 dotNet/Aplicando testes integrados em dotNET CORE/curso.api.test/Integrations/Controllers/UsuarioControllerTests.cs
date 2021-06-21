using curso.api.Models.Usuarios;
using Microsoft.AspNetCore.Mvc.Testing;
using Newtonsoft.Json;
using System.Net;
using System.Net.Http;
using System.Text;
using Xunit;

namespace curso.api.test.integrations.controllers
{
    public class UsuarioControllerTests : IClassFixture<WebApplicationFactory<Startup>>
    {
        private readonly WebApplicationFactory<Startup> _factory;
        private readonly HttpClient _httpClient;

        public UsuarioControllerTests(WebApplicationFactory<Startup> factory)
        {
            _factory = factory;
            _httpClient = _factory.CreateClient();
        }

        //WhenGivenThen
        //Quando_Dados_EntaoResultadoEsperado

        [Fact]
        public void Logar_InformandoUsuarioESenhaExistentes_DeveRetornarSucesso()
        {
            //padrão AAA

            //Arrange
            var loginViewModelInput = new LoginViewModelInput
            {
                Login = "Alexandre",
                Senha = "123456"
            };

            StringContent content = new StringContent(JsonConvert.SerializeObject(loginViewModelInput), Encoding.UTF8, "application/json");

            //Act (actions)
            var httpClientRequest = _httpClient.PostAsync("api/v1/usuario/logar", content).GetAwaiter().GetResult();

            //Assert
            Assert.Equal(HttpStatusCode.OK, httpClientRequest.StatusCode);
        }
    }
}
