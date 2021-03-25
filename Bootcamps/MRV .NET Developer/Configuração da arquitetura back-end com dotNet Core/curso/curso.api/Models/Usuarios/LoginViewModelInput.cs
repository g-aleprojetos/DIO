using System.ComponentModel.DataAnnotations;

namespace curso.api.Models.Usuarios
{
    public class LoginViewModelInput
    {
        [Required(ErrorMessage =  "O login é obrigatório")]
        public string Login { get; set; }

        [Required(ErrorMessage =  "A senha é obrigatório")]
        public string Senha { get; set; }
    }
}
