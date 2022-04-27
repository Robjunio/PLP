class Pessoa
    def initalize(nome_pessoa)
        puts "Meu nome é: #{nome_pessoa}"
    end
end

class Amigo < Pessoa
    def cumprimento_pelo_nome(nome)
      cumprimento_basico = super(nome)
      "#{cumprimento_basico} Feliz em te ver!"
    end
end
