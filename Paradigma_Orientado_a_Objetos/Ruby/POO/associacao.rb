class Professor
    def initalize(nome)
      @nome = nome
    end
    def to_s
        @nome
    end
end

class Estudante
    def initalize(nome)
       @nome = nome
    end
    def to_s
        @nome
    end
end

professor = Professor.new "Jucimar"
estudante = Estudante.new "Marcos"

puts "Professor: #{professor} Estudante: #{estudante}" 