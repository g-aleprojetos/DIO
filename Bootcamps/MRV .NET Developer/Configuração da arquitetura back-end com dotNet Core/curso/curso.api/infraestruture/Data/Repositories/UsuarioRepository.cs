using curso.api.Business.Entities;
using curso.api.Business.Repositories;

namespace curso.api.infraestruture.Data.Repositories
{
    public class UsuarioRepository : IUsuarioRepository
    {
        private readonly CursoDbContext _contexto;

        public UsuarioRepository(CursoDbContext contexto)
        {
            _contexto = contexto;
        }

        public void Adicionar(Usuario usuario)
        {
            _contexto.Usuario.Add(usuario);
          
        }

        public void Commit()
        {
            _contexto.SaveChanges();
        }
    }
}
