import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { Example10SharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [Example10SharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [Example10SharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class Example10SharedModule {
  static forRoot() {
    return {
      ngModule: Example10SharedModule
    };
  }
}
