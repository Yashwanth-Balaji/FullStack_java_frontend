import { Routes } from '@angular/router';
import { Admin } from '../../component/admin/admin';
import { User } from '../../component/user/user';
import { SignalEx } from '../../component/signal-ex/signal-ex';
import { Databinding } from '../../component/databinding/databinding';
import { ControlFlow } from '../../component/control-flow/control-flow';

export const routes: Routes = [
    {
        path:'admin',
        component:Admin
    },
    {
        path:'user',
        component:User
    },
    {
        path:'signal',
        component:SignalEx
    },
    {
        path:'dataBinding',
        component:Databinding
    },
    {
        path:'control',
        component:ControlFlow
    }
];
