using curso.api.Models.Cursos;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using System.Collections.Generic;
using System.Security.Claims;
using System.Threading.Tasks;

namespace curso.api.Controllers
{
    [Route("api/v1/cursos")]
    [ApiController]
    [Authorize]
    public class CursoController : ControllerBase
    {
        /// <summary>
        /// este serviço permite cadastrar curso para o usuário autenticar
        /// </summary>
        /// <returns>Retorna status 201 e dados do curso do usário.</returns>

        [SwaggerResponse(statusCode: 201, description: "Sucesso ao Cadastrar um curso", Type = typeof(CursoViewModeInput))]
        [SwaggerResponse(statusCode: 401, description: "Não autorizado")]
      

        [HttpPost]
        [Route("")]

        public async Task<IActionResult> Post(CursoViewModeInput cursoViewModeInput)
        {
            var codigoUsuario = int.Parse(User.FindFirst(c =>  c.Type == ClaimTypes.NameIdentifier)?.Value);
            return Created("", cursoViewModeInput);
        }

        /// <summary>
        /// Este seviço permite obter todos os cursos ativos do usuário
        /// </summary>
        /// <returns>Retorna status ok e dados do curso do usuário.</returns>

        [SwaggerResponse(statusCode: 200, description: "Sucesso ao autenticar")]
        [SwaggerResponse(statusCode: 401, description: "Não autorizado")]

        [HttpGet]
        [Route("")]
        public async Task<IActionResult> Get()
        {
            var cursos = new List<CursoViewModeOutput>();

          //  var codigoUsuario = int.Parse(User.FindFirst(c => c.Type == ClaimTypes.NameIdentifier)?.Value);

            cursos.Add(new CursoViewModeOutput()
            {
              //  Login = codigoUsuario.ToString(),
                Login = "",
                Descricao = "teste",
                Nome = "teste"
            }) ;
            return Ok(cursos);
        }

    }
}
