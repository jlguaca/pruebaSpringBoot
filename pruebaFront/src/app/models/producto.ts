export class Producto {
    id?: number;
    creation_date:Date;
    description: string
    expiry_date:Date;
    name:string;
    price:number

    constructor(id?: number, creation_date?: Date, description?: string, expiry_date?: Date, name?: string, price?: number){
        this.id = id || 0;
        this.creation_date = creation_date || new Date;
        this.description = description || '';
        this.expiry_date = expiry_date || new Date;
        this.name = name || '';
        this.price =price || 0;
    }
}


