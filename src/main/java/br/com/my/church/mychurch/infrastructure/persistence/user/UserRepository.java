package br.com.my.church.mychurch.infrastructure.persistence.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.ResultSet;
import java.util.Date;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	UserEntity findById(long id);
	UserEntity findByEmail(String email);
	@Query(value = "UPDATE usuario set nome = ?1, email = ?2, fone = ?3, instituicao = ?4, nascimento = ?5, senha = ?6, ano_ingresso = ?7, matricula = ?8  WHERE cpf = '00486870065'", nativeQuery = true)
	ResultSet update(String nome, String email, String fone, String Instituicao, Date nascimento, String senha, int anoIngresso, long matricula, String cpf);

	@Query(value = "SELECT count(*) FROM usuario WHERE id_igreja = ?1 AND aprovado = false", nativeQuery = true)
	int totalUsuariosNovos(long idIgreja);

	@Query(value = "SELECT count(*) FROM usuario WHERE id_igreja = ?1 AND ativo = false", nativeQuery = true)
	int totalUsuariosInativos(long idIgreja);

	@Query(value = "SELECT count(*) FROM usuario WHERE id_igreja = ?1", nativeQuery = true)
	int totalUsuarios(long idIgreja);
}
