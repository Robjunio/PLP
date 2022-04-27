class Cachorro

  def initalize
    puts puts "Meu nome é: Luke"
  end
    def falar
     puts "Latir!"
    end
   
    def mover(destino)
      puts "Correndo para o #{destino}."
    end
   
end


luke = Cachorro.new
luke.falar