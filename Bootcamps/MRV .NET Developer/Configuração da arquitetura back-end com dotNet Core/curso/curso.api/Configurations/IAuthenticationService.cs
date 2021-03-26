namespace curso.api.Configurations
{
    public interface IAuthenticationService
    {
        string GerarToken(UsuarioViewModeOutput usuarioViewModelOutput);
    }
}
