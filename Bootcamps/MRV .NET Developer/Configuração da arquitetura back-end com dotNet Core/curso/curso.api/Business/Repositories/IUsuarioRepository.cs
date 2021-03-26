using curso.api.Business.Entities;

namespace curso.api.Business.Repositories
{
    interface IUsuarioRepository
    {
        void Adicionar(Usuario usuario);
        void Commit();
    }
}
